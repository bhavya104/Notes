# Notes
Notes Application 📃📃📃

```
This application is made using room database and kotlin coroutines.
Firstly i used async task but after that i realize that async task is lengthy process.
Then I use coroutines of kotlin to minimize the async code.
```

## Library Used 


### Room Library
  implementation "androidx.room:room-runtime:$room_version"
  kapt "androidx.room:room-compiler:$room_version"

### Coroutines Support
  implementation "androidx.room:room-ktx:$room_version"
  implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.1.1'

### Navigation Support
  implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
  implementation "androidx.navigation:navigation-ui-ktx:$nav_version"

### Material Design Library
  implementation 'com.google.android.material:material:1.0.0'

### Recyclerview Library
  implementation 'androidx.recyclerview:recyclerview:1.0.0'

### Cardview Library
  implementation 'androidx.cardview:cardview:1.0.0'


