package com.generic;

import java.io.BufferedInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.RandomAccess;

/**
 * Created by kangaroo on 2017-2-22.
 */

public class MyException extends Exception {

    MyException(Exception e) throws URISyntaxException{
        super();
        e.initCause(e);//异常链条。

//        ByteBuffer
//        InputStream
//        FileOutputStream

//        FilterInputStream

//        BufferedInputStream

//        DataInput

//        DataInputStream

//        RandomAccess

//        RandomAccessFile


    }


}
