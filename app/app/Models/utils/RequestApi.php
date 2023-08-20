<?php

namespace App\Models\utils;

class RequestApi{

    public static function post( $endpoint, $data ){
        $enginer = curl_init($endpoint);
        curl_setopt($enginer, CURLOPT_POST, true);
        curl_setopt($enginer, CURLOPT_POSTFIELDS, json_encode($data));
        curl_setopt($enginer, CURLOPT_RETURNTRANSFER, true);
        $response = curl_exec($enginer);
        return $response;
    }
}
