var main = {
   init : function () {
       var _this = this;
       $('#btn-save').on('click', function () {
           _this.save();
       })
   },
   save : function () {
       var data = {
           p_name : $("#p_name").val(),
           p_price : $("#p_price").val(),
           p_desc : $("#p_desc").val()
       };

       $.ajax({
           type : 'POST',
           url : '/api/products',
           dataType : 'json',
           contentType : 'application/json; charset=utf-8',
           data : JSON.stringify(data)
       }).done(function () {
           alert('상품정보가 등록되었습니다.');
           window.location.href = '/';
       }).fail(function (error) {
           alert(JSON.stringify(error));
       })
   }
};

main.init();
