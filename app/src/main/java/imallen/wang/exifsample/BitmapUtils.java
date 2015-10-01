package imallen.wang.exifsample;

import android.graphics.Bitmap;
import android.media.ExifInterface;

/**
 * Created by allen on 15-9-14.
 */
public final class BitmapUtils {

    /* 目前Android SDK定义的Tag有:
   TAG_DATETIME 时间日期
   TAG_FLASH 闪光灯
   TAG_GPS_LATITUDE 纬度
   TAG_GPS_LATITUDE_REF 纬度参考
   TAG_GPS_LONGITUDE 经度
   TAG_GPS_LONGITUDE_REF 经度参考
   TAG_IMAGE_LENGTH 图片长
   TAG_IMAGE_WIDTH 图片宽
   TAG_MAKE 设备制造商
   TAG_MODEL 设备型号
   TAG_ORIENTATION 方向
   TAG_WHITE_BALANCE 白平衡
   */
    public static String getExifInfo(String imagePath)
    {
        try
        {
            //android读取图片EXIF信息
            ExifInterface exifInterface=new ExifInterface(imagePath);
            String smodel=exifInterface.getAttribute(ExifInterface.TAG_MODEL);
            String width=exifInterface.getAttribute(ExifInterface.TAG_IMAGE_WIDTH);
            String height=exifInterface.getAttribute(ExifInterface.TAG_IMAGE_LENGTH);

            /*
            exifInterface.setAttribute(ExifInterface.TAG_GPS_LATITUDE,"30.5");
            exifInterface.setAttribute(ExifInterface.TAG_GPS_LONGITUDE,"128.3");

            float[]output=new float[2];
            exifInterface.getLatLong(output);
            */

            String latitude=exifInterface.getAttribute(ExifInterface.TAG_GPS_LATITUDE);
            String longitude=exifInterface.getAttribute(ExifInterface.TAG_GPS_LONGITUDE);

            String latitudeRef=exifInterface.getAttribute(ExifInterface.TAG_GPS_LATITUDE_REF);
            String longitudeRef=exifInterface.getAttribute(ExifInterface.TAG_GPS_LONGITUDE_REF);




            StringBuilder sb=new StringBuilder();
            sb.append("smodel:");
            sb.append(smodel);
            sb.append("\n");
            sb.append("width:");
            sb.append(width);
            sb.append("\n");
            sb.append("height:");
            sb.append(height);
            sb.append("\n");
            sb.append("latitude:");
            sb.append(latitude);
            sb.append("\n");
            sb.append("longitude:");
            sb.append(longitude);
            sb.append("\n");

            sb.append("latitudeRef:");
            sb.append(latitudeRef);
            sb.append("\n");

            sb.append("longitudeRef:");
            sb.append(longitudeRef);
            sb.append("\n");

            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";

    }


}
