package com.mishalpandey.mindease

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mishalpandey.mindease.databinding.ActivityMainBinding
import com.mishalpandey.mindease.repetedCode.RepetedCode
import com.mishalpandey.mindease.ui.aiChat.AiChatFragment
import com.mishalpandey.mindease.ui.auth.introductionFragments.introductionFragment
import com.mishalpandey.mindease.ui.communities.CommunityFragment
import com.mishalpandey.mindease.ui.expert.ExpertFragment
import com.mishalpandey.mindease.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener { menuItem ->
//            check code is correct or not
            when (menuItem.itemId) {
                R.id.home->{
                    RepetedCode().intentFragment(R.id.frame, introductionFragment(), this)
                    true
                }
                R.id.Chats->{
                    RepetedCode().intentFragment(R.id.frame, AiChatFragment(), this)
                    true

                }
                R.id.Experts->{
                    RepetedCode().intentFragment(R.id.frame, ExpertFragment(), this)
                    true

                }

                R.id.Community-> {
                    RepetedCode().intentFragment(R.id.frame, CommunityFragment(), this)
                    true

                }else->{
                    RepetedCode().intentFragment(R.id.frame, HomeFragment(), this)
                    true

                }

            }

        }


    }
}