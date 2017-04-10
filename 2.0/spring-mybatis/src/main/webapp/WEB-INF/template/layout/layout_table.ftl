<#macro layout>
<html>
<head>
<title>${title!"默认标题"}</title>
<link rel="stylesheet" href="/css/bootstrap.css">
<link rel="stylesheet" href="/css/common.css">
<script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/js/common.js"></script>
<style>
body{padding:10px;}
</style>
<script>
$.ajaxSetup ({ 
    cache: false 
});
</script>
</head>
<body>
	<#include "layout/header.ftl">    
	<#-- 在这里嵌入main content -->
	<#nested>	    
	<#include "layout/footer.ftl">
</body>
</html>
</#macro>