<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

use App\Models\Converter;

class ConverterController extends Controller
{
    public function roman(){
        $data = [
            "title" => "Integer to Roman",
            "convert" => "Integer",
        ];
        return view("convert", $data);

    }
    public function integer(){
        $data = [
            "title" => "Roman to Integer",
            "convert" => "Roman",
        ];
        return view("convert", $data);

    }

    public function romanAction(Request $request){
        $integer = $request->input('convert');
        return Converter::toRoman( $integer );
    }
    public function integerAction(Request $request){
        $roman = $request->input('convert');
        return Converter::toInteger( $roman );

    }
}
