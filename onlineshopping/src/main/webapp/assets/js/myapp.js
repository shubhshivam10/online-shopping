$(function(){
	//Solving the active menu problem
	switch(menu){
	
	case'About US':
		$('#about').addClass('active');
		break;
	case'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		
	default:
		$('#listProducts').addClass('active');
	    $('#a_'+menu).addClass('active');
	
	    break;
	}
});