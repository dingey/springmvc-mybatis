<#macro layout>
<html>
<head>
<title></title>
<script type="text/javascript" src="/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="/js/common.js"></script>
</head>
<body>
    <div style="width: 700px; text-align:center; font-size:30px;">
	    <#include "header.ftl">
	    
	    <#-- 在这里嵌入main content -->
	    <#nested>
	    
	    <#include "footer.ftl">
    </div>
</body>
</html>
</#macro>