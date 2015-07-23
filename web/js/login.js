$("#login-button").click(function (event) {
    
    event.preventDefault();
    $('form').fadeOut(500);
    $('.wrapper').addClass('form-success');

    setTimeout(function() {
        enviar()
    }, 3000);
});

function enviar() {
    $('form').submit();
}