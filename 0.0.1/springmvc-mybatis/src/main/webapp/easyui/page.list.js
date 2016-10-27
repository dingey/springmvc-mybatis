 function getSelections(){
        var ss = [];
        var rows = $('#dg').datagrid('getSelections');
        for(var i=0; i<rows.length; i++){
            var row = rows[i];
            ss.push('<span>'+row.roleId+":"+row.roleName+'</span>');
        }
        $.messager.alert('Info', ss.join('<br/>'));
    }
    function submitForm(){
    	$('#ff').form('submit');
	}
	function clearForm(){
    	$('#ff').form('clear');
	}
    $(function(){
        var pager = $('#dg').datagrid().datagrid('getPager');    // get the pager of datagrid
        pager.pagination({
            buttons:[{
                iconCls:'icon-search',
                handler:function(){
                    alert('search');
                }
            },{
                iconCls:'icon-add',
                handler:function(){
                	$('#dlg').load("edit.html #fp");
                	$('#dlg').dialog('open');
                }
            },{
                iconCls:'icon-edit',
                handler:function(){
                    alert('edit');
                }
            },{
                iconCls:'icon-remove',
                handler:function(){
                    alert('remove');
                }
            }]
        });            
    })