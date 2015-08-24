'use strict';

angular.module('myApp.listaartigos.services', [])

        .service('artigoService', ['$http', function ($http) {

                this.carrega = function () {
                    return $http.get('/munif/api/artigo');
                }



            }]
                )