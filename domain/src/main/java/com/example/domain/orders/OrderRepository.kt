package com.example.domain.orders

import com.example.domain.base.ResultWrapper
import com.example.domain.models.DeliveryItemDomain
import com.example.domain.models.DiscountDomain
import kotlinx.coroutines.flow.Flow

/*********************************************************
 * Class   :  LoginLoacalSource
 * Author  :  Arun Nair
 * Created :  15/09/2022
 *******************************************************
 * Purpose :
 *******************************************************
 * Rework Details:
 * 1) {Author} :  {Date} : {Details}
 *********************************************************/

interface OrderRepository {
    suspend fun getOrderItems(id: Long): Flow<ResultWrapper<List<DeliveryItemDomain>>>
    suspend fun getDeliveryItemDiscount(id: Long): Flow<ResultWrapper<DiscountDomain>>
    suspend fun getOrders(): Flow<ResultWrapper<List<Long>>>
}