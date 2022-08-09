# Admob Open Ads Library
![maxresdefault](https://user-images.githubusercontent.com/84270801/183752232-d4538469-2cc0-4e91-abb6-8c8ecec44b91.jpg)

> Step 1. Add the JitPack repository to your build file

```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```
  
  > Step 2. Add the dependency

  
```gradle
dependencies {
 implementation 'com.github.kalathiyavraj:AdmobOpenAds:1.0'
}
  ```
  # How To Use Admob Open Ads Library
  
  > Step 1. Create a class like MainClass.class
  
  ```gradle
  new AppOpenManager(context, "ADMOB_OPEN_ADS_ID");
  ```
  
 > Step 2. Update menifest
  ```gradle
 name=".MyApplication"
 ```
 
  > Step 3. Add Permission
  ```gradle
  
    <uses-permission android:name="android.permission.INTERNET" />
```
 
