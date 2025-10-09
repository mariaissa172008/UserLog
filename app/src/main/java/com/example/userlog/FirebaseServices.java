package com.example.userlog;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.FirebaseStorage;

public class FirebaseServices
{
    private static FirebaseServices instance;
    private FirebaseAuth auth;
    private FirebaseFirestore fire;
    private FirebaseStorage storage;


    public FirebaseServices() {
        auth = FirebaseAuth.getInstance();
        fire = FirebaseFireStore.getInstance();
    }


}
