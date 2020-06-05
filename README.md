[![](https://jitpack.io/v/jinmiao/common-ktx.svg)](https://jitpack.io/#jinmiao/common-ktx)
![GitHub top language](https://img.shields.io/github/languages/top/jinmiao/common-ktx)
![GitHub Release Date](https://img.shields.io/github/release-date/jinmiao/common-ktx)
![GitHub](https://img.shields.io/github/license/jinmiao/common-ktx)

# 常用 kotlin 扩展库
日常开发常用的 kotlin 扩展库


# 背景
其实 Android 官方也提供了很好的 [Android KTX](https://developer.android.com/kotlin/ktx?hl=zh-cn)，它属于 [Android Jetpack 组件](https://developer.android.com/jetpack?hl=zh-cn) 的一部分。

为了提高开发效率，总结了这个 kotlin 常用扩展库。

# 都包括那些常用扩展
## context-ext

## view-ext

## toast-ext



# 在项目中引用
第一步，添加 Jitpack 仓库到项目的 Build 文件中
```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
第二步，添加对应的依赖
```
dependencies {
  // 引用所有扩展(一个就够了)
  implementation 'com.github.jinmiao:common-ktx:0.0.3'
  
  // 单独引用某类扩展
  // context 扩展
  implementation 'com.github.jinmiao.common-ktx:context-ext:0.0.3'
  // view 扩展
  implementation 'com.github.jinmiao.common-ktx:view-ext:0.0.3'
  // toast 扩展
  implementation 'com.github.jinmiao.common-ktx:toast-ext:0.0.3'
}
```


# 感谢
Jitpack.io


# License

MIT License

Copyright (c) 2020 Jinmiao

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
