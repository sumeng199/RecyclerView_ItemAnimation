/*
 *    Copyright (C) 2015 Haruki Hasegawa
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.h6ah4i.android.example.advrecyclerview.common.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.h6ah4i.android.example.advrecyclerview.common.data.AbstractDataProvider;
import com.h6ah4i.android.example.advrecyclerview.common.data.ExampleDataProvider;

public class ExampleDataProviderFragment extends Fragment {
    private AbstractDataProvider mDataProvider;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 可以在Activity重新创建时不完全销毁Fragment, 设置为true时， Fragment恢复时会跳过onCreate()和onDestroy()方法。可以有效的提高系统的运行效率。
        // 注意此时不能再onCreate放一些初始化逻辑
        setRetainInstance(true);  // keep the mDataProvider instance
        mDataProvider = new ExampleDataProvider();
    }

    public AbstractDataProvider getDataProvider() {
        return mDataProvider;
    }
}
