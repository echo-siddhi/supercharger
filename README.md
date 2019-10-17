# Supercharger
Stop creating tags at start of your files, Let Supercharger take care of it.
Supercharger will create tag with file name and calling method for you, so you can stop being paranoid and quit creating TAGs in your files.

Available on Jitpack,
First add jitpack to your project
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
and then,
```
dependencies {
    implementation 'com.github.daksh7011:supercharger:$superchargerVersion'
}
```
Latest Version: [![](https://jitpack.io/v/daksh7011/supercharger.svg)](https://jitpack.io/#daksh7011/supercharger)

Usage,

```
Log.d("your message")
```

Make sure you import package: `in`.technowolf.supercharger.Log to use the library.

Sorry for such ugly readme, but I will update it soon