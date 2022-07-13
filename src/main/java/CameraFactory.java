public class CameraFactory {
    public enum CameraManufacturer {
        CANON,
        NIKON,
    }

    public static Camera createCamera(CameraManufacturer cameraManufacturer){
        if(cameraManufacturer == CameraManufacturer.CANON){
            return new CanonCamera(new CanonFilm(), new CanonShutter(), new CanonMirror() );
        } else if(cameraManufacturer == CameraManufacturer.NIKON){
            return new NikonCamera(new NikonFilm(), new NikonShutter(), new NikonMirror());
        }
        return null;
    }
}