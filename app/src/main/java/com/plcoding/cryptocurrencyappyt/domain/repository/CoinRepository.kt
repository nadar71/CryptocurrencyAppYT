package com.plcoding.cryptocurrencyappyt.domain.repository

import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto
import com.plcoding.cryptocurrencyappyt.domain.model.Coin
import com.plcoding.cryptocurrencyappyt.domain.model.CoinDetail

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}