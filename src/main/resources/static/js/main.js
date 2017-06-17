var app = angular.module("springDemo", []);

app.controller("AppCtrl", function ($scope) {

    $scope.websites = [{
        iconImageUrl: '',
        id: 'stachoverflow',
        website: 'stachoverflow.com',
        title: 'Stachoverflow website',
        description: 'Stachoverflow description'
    }];
 });