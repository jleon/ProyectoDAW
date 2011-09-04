/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function(){
    $(".taxable-link").click(function(){
$("#taxable").slideToggle("slow");
$("#deadlines").css({ display: 'none' });
});
$("#taxable").css({ display: 'none' });
});

$(document).ready(function(){
    $(".deadlines-link").click(function(){
$("#deadlines").slideToggle("slow");
$("#taxable").css({ display: 'none' });
});
$("#deadlines").css({ display: 'none' });
});