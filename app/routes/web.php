<?php

use App\Http\Controllers\ConverterController;
use App\Http\Controllers\HomeController;
use Illuminate\Support\Facades\Route;

Route::get('/', [HomeController::class, 'home']);
Route::get('/convert/roman', [ConverterController::class, 'roman']);
Route::get('/convert/integer', [ConverterController::class, 'integer']);
Route::post('/convert/roman', [ConverterController::class, 'romanAction']);
Route::post('/convert/integer', [ConverterController::class, 'integerAction']);
