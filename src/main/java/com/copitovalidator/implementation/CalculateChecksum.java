package com.copitovalidator.implementation;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public class CalculateChecksum {

    public long CalculateChecksum(byte[] bytes) {
       //retorna en base 32
        Checksum crc32 = new CRC32();
        crc32.update(bytes, 0, bytes.length);
        return crc32.getValue();

    }
}
