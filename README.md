# RevenueCat
[![Build Status](https://travis-ci.com/stevesoltys/revenuecat.svg?branch=master)](https://travis-ci.com/github/stevesoltys/revenuecat)

An [RevenueCat API](https://docs.revenuecat.com/reference) wrapper.

## Installation
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    compile 'com.github.stevesoltys:revenuecat:0.1.1'
}
```

## Usage
Create a `RevenueCat` instance with your API key, and run an API query.

Here's an example:
```kotlin
val revenueCat = RevenueCat("sk_dfsg234fv7849hfqa4ufsd")

val subscriber = revenueCat.getOrCreateSubscriber(identifier)
// ...
```

## License
This library is available as open source under the terms of the [MIT License](http://opensource.org/licenses/MIT).
