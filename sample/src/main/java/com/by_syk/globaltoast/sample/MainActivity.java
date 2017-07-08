/*
 * Copyright 2017 By_syk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.by_syk.globaltoast.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.by_syk.lib.sp.SP;

/**
 * Created by By_syk on 2016-07-16.
 */

public class MainActivity extends Activity {
    private SP sp;

    private EditText etText1;
    private EditText etText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SP(this);

        etText1 = (EditText) findViewById(R.id.et_text1);
        etText2 = (EditText) findViewById(R.id.et_text2);
    }

    public void onSave(View view) {
        sp.save("text", etText1.getText().toString());
    }

    public void onGet(View view) {
        etText2.setText(sp.getString("text"));
    }
}
