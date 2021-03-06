package com.copitovalidator.implementation;

import java.nio.charset.StandardCharsets;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

public class CalculateChecksum16 {

    /**
     * Cyclic Redundancy Check (CRC-16/CCITT-FALSE 0xFFFF)
     *
     * @param payload
     * @return checksum Hexadecimal
     */
    protected String generateChecksum(String payload) {

        int checksum = 0xffff;
        int polynomial = 0x1021;

        byte[] data = payload.getBytes(StandardCharsets.UTF_8);
        for (byte b : data) {
            for (int i = 0; i < 8; i++) {
                boolean bit = ((b >> (7 - i) & 1) == 1);
                boolean c15 = ((checksum >> 15 & 1) == 1);
                checksum <<= 1;
                if (c15 ^ bit) {
                    checksum ^= polynomial;
                }
            }
        }
        checksum &= 0xffff;
        return String.format("%04X", checksum);
    }

}
