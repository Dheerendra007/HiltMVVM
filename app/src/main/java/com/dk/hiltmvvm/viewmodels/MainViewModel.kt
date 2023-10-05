package com.dk.hiltmvvm.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dk.dagger2retrofitcoroutines.models.Product
import com.dk.dagger2retrofitcoroutines.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: ProductRepository): ViewModel(){

     val productsLiveData: LiveData<List<Product>>
        get() = repository.products

      init {
          viewModelScope.launch {
              repository.getProduct()
          }
      }

}
