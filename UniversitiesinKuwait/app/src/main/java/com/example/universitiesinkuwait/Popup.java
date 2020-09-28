package com.example.universitiesinkuwait;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class Popup extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder uni = new AlertDialog.Builder(getActivity());
        uni.setTitle("Warning")
                .setMessage("Please select one of the universities from the top right corner")
                .setPositiveButton("Agree", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Thank you", Toast.LENGTH_SHORT).show();
            }
        });
        return uni.create();
    }
}
