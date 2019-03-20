package com.spring.boot.demo.Util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

public class Code {

        public static String CodeChange(HttpServletRequest request, HttpServletResponse response) throws IOException{
            org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("info");
            logger.info("CodeChange-Start");
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            String param = new String(StreamResolve.InputStreamTOByte(request.getInputStream()),"utf-8");
            param = Code.replace(param);
            return param;
        }

    public static String replace(String outBuffer){

        org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("info");
        logger.info("replace-Start");

        String data = outBuffer.toString();
        try{
            data = data.replaceAll("%(?![0-9a-fA-F]{2})", "%25");
            data = data.replaceAll("\\+", "%2B");
            data = URLDecoder.decode(data,"utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

}
