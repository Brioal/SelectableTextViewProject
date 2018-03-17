### 点击可选中单个单词的TextView,提供多选和其他自定义选项
### 效果图:![](https://github.com/Brioal/SelectableTextViewProject/blob/master/art/2.gif)
### 功能如效果图所示,另外提供多选复制的选项,没有对TextView进行过多自定义,更像是一个封装,因此使用方式按照TextView来使用即可
### 提供的方法列表

方法 | xml属性 | 方法描述 

:--|:--|:--|:--

`void setEnableMultSelect(boolean enableMultSelect)` | ``| 是否允许多选 
`void setEnableSingleSelect(boolean enableSingleSelect)` | `` | 是否允许单选
`void setSelectTextFrontColor(int selectTextFrontColor)` | '' | 设置选中单词的字体颜色(传入color值)
`void setSelectTextFrontColorRes(int selectTextFrontColor)`|``|设置选中单词的字体颜色(传入Res资源)
`void setSelectTextBackColor(int selectTextBackColor)` | '' | 设置选中单词的背景颜色(传入color值)
`void setSelectTextBackColorRes(int selectTextBackColor)`|``|设置选中单词的背景颜色(传入Res资源)
`void setOnWordClickListener(OnWordClickListener onWordClickListener)`|``|设置选中单词的响应事件
`dismissSelected()`|``|去除选中效果

### 完毕
### 另外我建了个qq群,方便交流,欢迎各种大神,新手老手加入,群号码:375276053
