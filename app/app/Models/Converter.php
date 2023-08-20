<?php

namespace App\Models;
use App\Models\utils\RequestApi;
class Converter{



    public static function toRoman( $integer ){
        $data = [
            'entry' => $integer
        ];

        return RequestApi::post("http://localhost:8080/convert/integer", $data);
    }
    public static function toInteger( $roman ){
        $data = [
            'entry' => $roman
        ];

        return RequestApi::post("http://localhost:8080/convert/integer", $data);
    }
}
