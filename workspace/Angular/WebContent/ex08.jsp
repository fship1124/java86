<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/angular-1.5.8/angular.min.js" ></script>
</head>
<body>
	<div ng-app="myApp" ng-controller="myCtrl" >
		<p>{{ content }}}}</p>
	</div>
	<script >
		var app = angular.module("myApp",[]);
		app.controller("myCtrl", function($scope, $http){
			var data = {
				name  : "정효순",
				age : 34
			};
			/*$http({
				method : "POST",       // GET방식 또한 가능
				url : "result.jsp",
				// data : 
				  params : {
					name : "정효순",
					 age : 34
				} 
// 				params : data
			}).then(function mySuccess(response){
				$scope.content = response.data;
			}); */
			$http.get("result.jsp", data).then(
					function mySuccess(response){
						$scope.content = response.data;
					}
			);
		});
	</script>
</body>
</html>