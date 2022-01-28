package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.assignment2.repository.TractorRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productRepository = TractorRepository()
        val viewModelProviderFactory = MainViewModelProviderFactory(application, productRepository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory).get(MainViewModel::class.java)

        viewModel.pushPost()

        val res = viewModel.newDetails.value?.body()
        if (res != null) {
            for (i in res){
                if(i.id==135){
                    Glide.with(this).load(i.user.image_url).into(imgPersonImage)
                    txtPersonName.text=i.user.name
                    txtPersonAddress.text=i.user.address
                    txtSizeAns.text=i.size_hp.toString()
                    txtCompanyAns.text=i.make
                    txtVehicleAns.text=i.vehicle_number
                    txtImplementsAns.text=i.tractor_implements[0].name
                    txtImplementsAns2.text=i.tractor_implements[1].name
                    txtImplementsAns3.text=i.tractor_implements[2].name
                    // val temp1 = i.tractorpicture_set.get(0)
                    if(i.tractorpicture_set[0].image_url!=null)
                    Glide.with(this).load(i.tractorpicture_set[0].image_url).into(img1)
                    if(i.tractorpicture_set[1].image_url!=null)
                    Glide.with(this).load(i.tractorpicture_set[1].image_url).into(img2)
                    if(i.tractorpicture_set[2].image_url!=null)
                    Glide.with(this).load(i.tractorpicture_set[2].image_url).into(img3)
                    if(i.tractorpicture_set[3].image_url!=null)
                    Glide.with(this).load(i.tractorpicture_set[3].image_url).into(img4)
                }

            }
        }

    }
}