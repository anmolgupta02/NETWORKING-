/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);
        ArrayList<DataItems> dataItems = new ArrayList<>();
        dataItems.add(new DataItems("7.2","San Francisco","Feb 2, 2016"));
        dataItems.add(new DataItems("6.1","London","30-August-2015"));
        dataItems.add(new DataItems("7.2","Melbourne","Feb 2, 2016"));
        dataItems.add(new DataItems("7.2","Delhi","Feb 2, 2016"));
        dataItems.add(new DataItems("7.2","Mumbai","Feb 2, 2016"));
        dataItems.add(new DataItems("7.2","Kolkata","Feb 2, 2016"));
        dataItems.add(new DataItems("7.2","Japan","Feb 2, 2016"));

        CustomAdapter customAdapter = new CustomAdapter(this,dataItems);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(customAdapter);
    }
}
