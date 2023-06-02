# calculadoraKtDesdeCero
en MainActivity.kt 

!!.text 

refiere a que es un editable de las activities en .XML

# el archivo del proyecto de graddle se modifica con:

bajar la version del min SDK a 24.

se observa que los archivos comienzan con esto.
plugins {
    id 'com.android.application'
    id 'kotlin-android'
}

y se agrega esto:

    kotlinOptions {
        jvmTarget = '1.8'
    }
}

finalmente dependecias queda cambiada asi:

dependencies {
    implementation 'androidx.core:core-ktx:1.6.0'
