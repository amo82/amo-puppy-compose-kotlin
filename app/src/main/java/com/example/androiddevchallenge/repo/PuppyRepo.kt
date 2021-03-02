/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.repo

import com.example.androiddevchallenge.model.Puppy

/**
 * A fake repo
 */
object PuppyRepo {
    fun getPuppy(puppyId: Long): Puppy = puppyList.find { it.id == puppyId }!!
    fun getRelated(@Suppress("UNUSED_PARAMETER") courseId: Long): List<Puppy> = puppyList
}

val puppyList = listOf(
    Puppy(
        id = 0,
        name = "Julius",
        breed = "Cats",
        thumbUrl = "https://dl5zpyw5k3jeb.cloudfront.net/photos/pets/50468078/1/",
        thumbContentDesc = "",
        description = "Julius is a young active cat desiring a house where he can run, play and get hugs.\n" +
            "\n" +
            "All our adult cats has one viral vaccine shot and kittens have 2-3 viral vaccine shot, anti-rabies w/ certificate, dewormed, spayed/neutered and microchipped.\n" +
            "\n" +
            "If you're interested in adopting Julius, please fill our form at: https://cutt.ly/rg3m3ER",

    ),
    Puppy(
        id = 1,
        name = "Vicki",
        breed = "Cats",
        thumbUrl = "https://dl5zpyw5k3jeb.cloudfront.net/img/94dda9e5-aa7b-4138-8b05-9f8f89e986ee.jpg",
        thumbContentDesc = "",
        description = "Having always been an animal lover I couldn't help but notice a void in my life- the house was so lonely. After living away from home for a while, I felt the desire to find a little companion who was down on their luck, needing a home and love. I decided on adopting a cat because I was in an apartment and I thought a dog would need more room than what I could offer. One Saturday I drove to my local Humane society shelter to look at cats who were eligible for adoption. My bleeding heart wanted to help all of those sweet kitties who were pawing at the kennel doors and meowing for attention. In the far side of the room I saw a handsome grey cat who didnt bother to get up. He seemed fat and content, Something about him just stood out to me. I guess you could say it was love at first sight. Not much later we were on our way home. We were fast friends. Goku was mischeivious, sometimes downright bad. But I loved him dearly. He met me at the front door He was always there to comfort and snuggle. He made us laugh and smile. Goku was an elderly cat who had health issues. He was my pal all the way to the end and im grateful to have had him. I recently lost him. Adopt a pet Save a life.",

    ),
    Puppy(
        id = 2,
        name = "Christina",
        breed = "Rabbit",
        thumbUrl = "https://dl5zpyw5k3jeb.cloudfront.net/img/131aa6a4-88b5-4ed7-8049-2eba997be9a2.jpg",
        thumbContentDesc = "",
        description = "I found my winter on pet finder he is a French angora rabbit is so friendly and lovable I love file very much! So before I had got winter i has just lost my French angora rabbit his name was scarley who I loved very much and still do he was my best friend and we had a very strong bond between us...I had him since he was a month in a half old...he died at only three years old which devastated me I was left with a shattered heart! After the passing of my baby I started liking for another French angora rabbit that’s when I stumbled upon winter on per finder...I had got I contact with the people where he was staying at and explained my story about my previous baby..so I made plans to drive all the way to New Hampshire to adopt him! I’m happy I did because he makes me smile everyday..he is a very happy rabbit and loves to eat his hay and veggies I’m hoping I have a long life with him! He brings a lotta joy to my heart! I’m thankful to have him in my life! ❤️I found my winter on pet finder he is a French angora rabbit is so friendly and lovable I love file very much! So before I had got winter i has just lost my French angora rabbit his name was scarley who I loved very much and still do he was my best friend and we had a very strong bond between us...I had him since he was a month in a half old...he died at only three years old which devastated me I was left with a shattered heart! After the passing of my baby I started liking for another French angora rabbit that’s when I stumbled upon winter on per finder...I had got I contact with the people where he was staying at and explained my story about my previous baby..so I made plans to drive all the way to New Hampshire to adopt him! I’m happy I did because he makes me smile everyday..he is a very happy rabbit and loves to eat his hay and veggies I’m hoping I have a long life with him! He brings a lotta joy to my heart! I’m thankful to have him in my life! ❤"
    ),
    Puppy(
        id = 3,
        name = "Maggie",
        breed = "Dog",
        thumbUrl = "https://dl5zpyw5k3jeb.cloudfront.net/img/65fcdca3-0614-4a8e-8756-b59f27af94b0.jpg",
        thumbContentDesc = "",
        description = "After 40 dogless years, I searched Petfinder doggie bios for an adult housetrained dog. Buford's bio was the one I settled on. Filling out the application was the longest part. I picked him up April 2020. Bless his heart, he came home with me after meeting me only 15 minutes earlier. A dog-owning girlfriend had already helped me shop for a doggie bed, leash, crate, toys, etc. so I was ready for him. She even drove so I could pay attention to him on the ride home. Fortunately Buford loves toys and tugging on them, so it gave us a way to bond. I walked him on a leash in my neighborhood 5 times a day and got more outdoor exercise than I had ever had! That was good for me! Eventually I found a way to secure my back yard (adding garden fencing to open places) so he could run on his own. I got used to his odd name cuz I didn't want him to have to change it. We took a few helpful dog-training lessons at the pet store. He slept crated a few days but now has his own blanket on my bed. He is a joy to me each morning. After he got used to his new home I no longer crate him when I go out. He loves car rides and is loved by my friends. Adorable Buford has increased my happiness."
    ),
    Puppy(
        id = 4,
        name = "David",
        breed = "Dog",
        thumbUrl = "https://dl5zpyw5k3jeb.cloudfront.net/img/6e8f07eb-5753-4d1e-b85e-7e99ade35816.jpg",
        thumbContentDesc = "",
        description = "We found Bella while searching on the pet finders web site. She took to me almost immediately. This was a good thing seeing how I was looking for a dog that would be supportive of my needs. Since I am in a wheelchair she always comes when I go some place in it (even if asleep). She is definitely part of my family."
    ),
    Puppy(
        id = 5,
        name = "Bluebell",
        breed = "Dog",
        thumbUrl = "https://dl5zpyw5k3jeb.cloudfront.net/photos/pets/50703157/2/",
        thumbContentDesc = "",
        description = "Bluebell and her brother Mac are 3 month old lab/ Jack Russell terrier mixes. They were found as strays outside of Memphis TN and are doing great in a foster home. Bluebell is an adorable puppy. She is active and playful and we know she will make a great pet. She loves attention and is very sweet and affectionate. She will most likely be a medium sized adult. Bluebell has been spayed and is up to date on her shots. She is ready to travel to her forever home!\n" +
            "\n" +
            "Bluebell is currently in TN but will be transported north to New England for adoption. The adoption donation is \$500 which includes a health certificate and costs for her transport north."

    ),
    Puppy(
        id = 6,
        name = "Freya",
        breed = "Dog",
        thumbUrl = "https://dl5zpyw5k3jeb.cloudfront.net/img/24555ceb-313f-4a2b-bb7a-a45df2ffd37f.jpg",
        thumbContentDesc = "",
        description = "Calypso was found wandering the streets with a big belly to feed her puppies. The rescuers tracked her to a house which she lived at and lived under a bed. She had been very abused and traumatized. She and her puppies were saved and all of her puppies went to wonderful homes. After almost a year no one had reached out to try to adopt her. And that's when I saw her. She isn't the kind of dog I originally wanted but when I heard her story I needed to save her. Every single day for two weeks I checked my email to see if I had gotten any updates about her and finally I did. I met her on June 29th and I immediately loved her and had a connection with her. My favorite part about adopting would be all the firsts. "

    )

)
