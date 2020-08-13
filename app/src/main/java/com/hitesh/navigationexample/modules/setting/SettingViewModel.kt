package com.hitesh.navigationexample.modules.setting

import androidx.lifecycle.ViewModel

class SettingViewModel(val settingRepository: SettingRepository) : ViewModel(){
    val data = "Lets change the setting"
}