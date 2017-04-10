<nav aria-label="Page navigation">
	<ul class="pagination">		
		<li <#if (pageInfo.pageNum<2)>class="disabled"</#if> >
			<a href="#" aria-label="Previous" title="前一页" onclick="page(${pageInfo.prePage})"> <span aria-hidden="true">&laquo;</span></a></li>
		<#if (pageInfo.pageNum<4&&pageInfo.pages<7)>
			<#list 1..pageInfo.pages as t>
				<li <#if (pageInfo.pageNum==t)>class="active"</#if>><a href="#" onclick="page(${t})">${t}</a></li>
			</#list>
		<#elseif (pageInfo.pageNum<4&&pageInfo.pages>6)>
			<#list 1..5 as t>
				<li <#if (pageInfo.pageNum==t)>class="active"</#if>><a href="#" onclick="page(${t})">${t}</a></li>
			</#list>
			<li><span>…</span></li>
			<li><a href="#" onclick="page(${pageInfo.pages})">${pageInfo.pages}</a></li>
		<#elseif (pageInfo.pageNum=4&&pageInfo.pages<8)>
			<li><a href="#" onclick="page(1)">1</a></li>
			<#list 2..pageInfo.pages as t>
				<li <#if (pageInfo.pageNum==t)>class="active"</#if>><a href="#" onclick="page(${t})">${t}</a></li>
			</#list>
		<#elseif (pageInfo.pageNum=4&&pageInfo.pages>7)>
			<li><a href="#" onclick="page(1)">1</a></li>
			<#list 2..6 as t>
				<li <#if (pageInfo.pageNum==t)>class="active"</#if>><a href="#" onclick="page(${t})">${t}</a></li>
			</#list>
			<li><span>…</span></li>
			<li><a href="#" onclick="page(${pageInfo.pages})">${pageInfo.pages}</a></li>
		<#elseif (pageInfo.pageNum>4&&(pageInfo.pages-pageInfo.pageNum)>3)>
			<li><a href="#" onclick="page(1)">1</a></li>
			<li><span>…</span></li>
			<#list (pageInfo.pageNum-2)..(pageInfo.pageNum+2) as t>
				<li <#if (pageInfo.pageNum==t)>class="active"</#if>><a href="#" onclick="page(${t})">${t}</a></li>
			</#list>
			<li><span>…</span></li>
			<li><a href="#" onclick="page(${pageInfo.pages})">${pageInfo.pages}</a></li>
		<#elseif (pageInfo.pageNum>5&&(pageInfo.pages-pageInfo.pageNum)<=3)>
			<li><a href="#" onclick="page(1)">1</a></li>
			<li><span>…</span></li>
			<#list (pageInfo.pages-5)..(pageInfo.pages) as t>
				<li <#if (pageInfo.pageNum==t)>class="active"</#if>><a href="#" onclick="page(${t})">${t}</a></li>
			</#list>
		<#elseif (pageInfo.pageNum==5)>
			<#list 1..(pageInfo.pages) as t>
				<li <#if (pageInfo.pageNum==t)>class="active"</#if>><a href="#" onclick="page(${t})">${t}</a></li>
			</#list>	
		</#if>
		<li <#if (pageInfo.pageNum>=pageInfo.pages)>class="disabled"</#if>>
			<a href="#" aria-label="Next" onclick="page(${pageInfo.nextPage})"> <span aria-hidden="true" title="下一页">&raquo;</span></a></li>
	</ul>
</nav>