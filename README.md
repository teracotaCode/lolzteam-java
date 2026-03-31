# lzt-api-java

[![CI](https://github.com/teracotaCode/lolzteam-java/actions/workflows/ci.yml/badge.svg)](https://github.com/teracotaCode/lolzteam-java/actions/workflows/ci.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

Java-обёртка для API **Lolzteam Forum** и **Market**.

Автоматически сгенерирована из OpenAPI 3.1 схем с полной типизацией, nullable-полями, повторными запросами, ограничением частоты запросов и поддержкой прокси.

## Требования

- Java 17+
- Gradle 8+

## Установка

### Gradle (Kotlin DSL)
```kotlin
// Клонируйте репозиторий и подключите как локальный проект
// git clone https://github.com/teracotaCode/lolzteam-java.git
```

### Gradle (Groovy)
```groovy
// git clone https://github.com/teracotaCode/lolzteam-java.git
```

### Maven
```xml
<dependency>
    <groupId>com.lolzteam</groupId>
    <artifactId>lzt-api-java</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Быстрый старт

```java
import com.lolzteam.runtime.*;
import com.lolzteam.generated.forum.ForumClient;
import com.lolzteam.generated.market.MarketClient;

// Создание HTTP-клиента
var httpClient = new LolzteamHttpClient.Builder("your-access-token")
    .rateLimitConfig(RateLimitConfig.DEFAULT)  // 3 запроса/сек
    .retryConfig(RetryConfig.DEFAULT)          // 3 повтора с отсрочкой
    .build();

// Forum API
var forum = new ForumClient(httpClient);
var categories = forum.categoriesList(null, null, null);
var user = forum.usersGet(1);

// Market API
var market = new MarketClient(httpClient);
var items = market.categorySteam(null, null, null, /* ... */ null);
```

## Возможности

### Ограничение частоты запросов
```java
// Лимит: 5 запросов за 2 секунды
var config = new RateLimitConfig(5, Duration.ofSeconds(2));
var client = new LolzteamHttpClient.Builder("token")
    .rateLimitConfig(config)
    .build();
```

### Повторные запросы с экспоненциальной отсрочкой
```java
// 5 повторов, начальная задержка 500мс, множитель 2x, максимум 30с
var retry = new RetryConfig(5, Duration.ofMillis(500), 2.0, Duration.ofSeconds(30));
var client = new LolzteamHttpClient.Builder("token")
    .retryConfig(retry)
    .build();
```

### Поддержка прокси
```java
// HTTP-прокси
var proxy = ProxyConfig.fromUrl("http://user:pass@proxy.example.com:8080");

// SOCKS5-прокси
var socks = ProxyConfig.fromUrl("socks5://proxy.example.com:1080");

var client = new LolzteamHttpClient.Builder("token")
    .proxy(proxy)
    .build();
```

### Обработка ошибок
```java
try {
    var user = forum.usersGet(123);
} catch (LolzteamRateLimitException e) {
    // 429 — превышен лимит запросов, e.getRetryAfter() доступен
} catch (LolzteamAuthException e) {
    // 401/403 — ошибка аутентификации
} catch (LolzteamNotFoundException e) {
    // 404 — ресурс не найден
} catch (LolzteamValidationException e) {
    // 400/422 — ошибка валидации
} catch (LolzteamNetworkException e) {
    // Ошибки соединения/таймаута
} catch (LolzteamApiException e) {
    // Прочие ошибки API — e.getStatusCode(), e.getResponseBody()
}
```

### Null-безопасность

Все поля моделей ответов nullable (обёрточные типы: `Integer`, `Boolean`, `String` и т.д.):

```java
var user = forum.usersGet(1);
if (user.userId() != null) {
    System.out.println("ID пользователя: " + user.userId());
}
```

Все модели используют `@JsonIgnoreProperties(ignoreUnknown = true)` для прямой совместимости.

## Генерация кода

Перегенерация клиентов из обновлённых схем:

```bash
python3 codegen/generate.py \
  --schema schemas/forum.json \
  --output-dir src/main/java/com/lolzteam/generated/forum \
  --package com.lolzteam.generated.forum

python3 codegen/generate.py \
  --schema schemas/market.json \
  --output-dir src/main/java/com/lolzteam/generated/market \
  --package com.lolzteam.generated.market
```

## Структура проекта

```
src/main/java/com/lolzteam/
├── runtime/                    # HTTP-клиент, повторы, лимиты, прокси
│   ├── HttpClientInterface.java
│   ├── LolzteamHttpClient.java
│   ├── RetryConfig.java
│   ├── RetryHandler.java
│   ├── RateLimitConfig.java
│   ├── RateLimiter.java
│   ├── ProxyConfig.java
│   └── errors/                 # Иерархия исключений
│       ├── LolzteamException.java
│       ├── LolzteamApiException.java
│       ├── LolzteamAuthException.java
│       ├── LolzteamRateLimitException.java
│       ├── LolzteamNotFoundException.java
│       ├── LolzteamValidationException.java
│       └── LolzteamNetworkException.java
└── generated/
    ├── forum/
    │   ├── ForumClient.java
    │   └── models/             # 116 моделей ответов
    └── market/
        ├── MarketClient.java
        └── models/             # 74 модели ответов
```

## Лицензия

MIT © 2026 Lolzteam
