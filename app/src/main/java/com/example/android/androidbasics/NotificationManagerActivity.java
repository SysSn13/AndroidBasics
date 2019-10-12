package com.example.android.androidbasics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static com.example.android.androidbasics.App.CHANNEL_1_ID;
import static com.example.android.androidbasics.App.CHANNEL_2_ID;
public class NotificationManagerActivity extends AppCompatActivity {
    private Button buttonShowNotification;
    private NotificationManagerCompat notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_manager);
        buttonShowNotification = (Button) findViewById(R.id.button_show_notification);
        notificationManager = NotificationManagerCompat.from(this);
        buttonShowNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Notification notification = new NotificationCompat.Builder(NotificationManagerActivity.this, CHANNEL_1_ID)
                        .setSmallIcon(R.drawable.logo)
                        .setContentTitle("title")
                        .setContentText("message")
                        .setPriority(NotificationCompat.PRIORITY_HIGH)
                        .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                        .build();

                notificationManager.notify(1, notification);
            }
        });
    }
}
