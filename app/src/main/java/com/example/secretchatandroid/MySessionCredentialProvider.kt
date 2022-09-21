package com.example.secretchatandroid

import com.tencent.qcloud.core.auth.BasicLifecycleCredentialProvider
import com.tencent.qcloud.core.auth.QCloudLifecycleCredentials
import com.tencent.qcloud.core.auth.SessionQCloudCredentials

class MySessionCredentialProvider : BasicLifecycleCredentialProvider() {


    override fun fetchNewCredentials(): QCloudLifecycleCredentials {
        val tmpSecretId = "SECRETID" // 临时密钥 SecretId
        val tmpSecretKey = "SECRETKEY" // 临时密钥 SecretKey
        val sessionToken = "SESSIONTOKEN" // 临时密钥 Token
        val expiredTime = 1556183496L //临时密钥有效截止时间戳，单位是秒
        val startTime = 1556182000L
        return SessionQCloudCredentials(tmpSecretId, tmpSecretKey, sessionToken, startTime, expiredTime)
    }
}