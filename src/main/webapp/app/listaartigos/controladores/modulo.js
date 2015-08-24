'use strict';

angular.module('myApp.listaartigos.controles', ['myApp.listaartigos.services'])

        .controller('controlador', ['$scope', 'artigoService', function ($scope, artigoService) {

                $scope.nome = 'munif';
                artigoService.carrega().then(function (response) {
                    $scope.artigos=response.data;
                }, function (response) {
                    $scope.artigos=[{titulo:'falha'}];
                });




            }]
                )