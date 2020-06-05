package com.jinmiao.common.context.ext

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.pm.PackageManager
import android.os.Build


fun Context.checkSelfPermissionCompat(permission: String): Boolean = if (Build.VERSION.SDK_INT >= 23)
    checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED else true

fun Context.getActivity(): Activity? {
    return when (this) {
        is Activity -> this
        is ContextWrapper -> baseContext.getActivity()
        else -> null
    }
}