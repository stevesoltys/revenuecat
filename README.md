# RevenueCat
[![Build Status](https://travis-ci.org/stevesoltys/revenuecat.svg?branch=master)](https://travis-ci.org/github/stevesoltys/revenuecat)

An [RevenueCat API](https://docs.revenuecat.com/reference) wrapper.

## Installation
```groovy
repositories {
    jcenter()
    maven { url 'https://jitpack.io' }
}

dependencies {
    compile 'com.github.stevesoltys:revenuecat:0.1.0'
}
```

## Usage
Create a `RevenueCat` instance with your credentials, and run an API query.

Here's an example:
```kotlin
val revenueCat = RevenueCat("sk_dfsg234fv7849hfqa4ufsd")

val searchResultArtist = revenueCat.search(
    "j cole", types = setOf(SearchResultType.ARTISTS)
).results?.artists?.data?.first()

val artistAlbums = revenueCat.getAllAlbumsByArtistId(searchResultArtist!!.id!!)

// ...
```

## License
This library is available as open source under the terms of the [MIT License](http://opensource.org/licenses/MIT).
