define([
        'angular',
        './controllers/compatibilityCheckController',
        './controllers/validator/skosValidatorController',
        './controllers/validator/validatorListController',
        './controllers/compatibilityController',
        './controllers/detailController',
        './controllers/discoveryController',
        './controllers/evaluationController',
        './controllers/indexController',
        './controllers/listController',
        './controllers/resultController',
        './controllers/hierarchyController',
        './controllers/layoutController',
        './directives/dynamicChart',
        './directives/forceLayout',
        './directives/sparkLine',
        './directives/treemap',
        './directives/sunburst',
        './directives/bilevel',
        './directives/packLayout',
        './websocket',
        './utils',
        './filters/labelFilter',
        './models/componentModel',
        './models/evaluationModel',
        './models/visualizationModel',
        './models/pipelineModel',
        'angular-resource',
        'angular-route',
        'angular-ui',
        'angular-loading-bar',
        'angular-file-upload',
        'ng-table',
        "bootstrap",
        "angular-moment",
        'highcharts-all',
        'highcharts-ng'
    ],
    function (ng) {
        'use strict';

        return ng.module('ldvm', [
            'ldvm.controllers',
            'ldvm.directives',
            'ldvm.filters',
            'ngRoute',
            'ngResource',
            'ngTable',
            'angular-loading-bar',
            'angularMoment',
            'highcharts-ng',
            'angularFileUpload'
        ]);
    });