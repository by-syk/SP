# SP

[![](https://jitpack.io/v/by-syk/SP.svg)](https://jitpack.io/#by-syk/SP)
[![](https://img.shields.io/badge/Download%20aar-1.0.9-brightgreen.svg)](out/sp-1.0.9.aar)

A simple library for using `android.content.SharedPreferences` conveniently.


### Adding to your project

This library is available through [**JitPack.io**](https://jitpack.io/).

**Step 1.** Add it in your root build.gradle at the end of repositories:

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2.** Add the dependency:

```
dependencies {
    compile 'com.github.by-syk:SP:1.0.9'
}
```


### How to use

If use [`SharedPreferences`](https://developer.android.google.cn/reference/android/content/SharedPreferences.html):

```
SharedPreferences sharedPreferences = context.getSharedPreferences(context
    .getPackageName(), Context.MODE_PRIVATE);
SharedPreferences.Editor editor = sharedPreferences.edit();
editor.putString("user", "By_syk");
editor.apply();
```

Now, use `SP`:

```
SP sp = new SP(context);
```

+ Save

  ```java
  sp.save("user", "By_syk");

  sp.put("num", 5)
      .put("valid", true)
      .save();
  ```

+ Delete

  ```
  sp.delete("user");
  
  sp.remove("num")
      .remove("valid")
      .save();
  ```

+ Get

  ```java
  String user = sp.getString("user");
  ```


### Demo APP

[Get it](out/SPSample.apk)


### License

    Copyright 2017 By_syk

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


*Copyright &#169; 2017 By_syk. All rights reserved.*