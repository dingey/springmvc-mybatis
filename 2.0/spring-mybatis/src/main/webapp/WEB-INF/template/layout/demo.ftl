<#-- 引入布局指令的命名空间 -->
<#import "web_layout.ftl" as webLayout>
<#-- 调用布局指令 -->
<@webLayout.layout>
    <#-- 将下面这个main content嵌入到layout指令的nested块中 -->
    <div>main content</div>
</@webLayout.layout>