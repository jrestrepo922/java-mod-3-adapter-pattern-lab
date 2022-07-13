public class Main {
    public static void main(String[] args) {
        // your code here
        Camera newCamera = CameraFactory.createCamera(CameraFactory.CameraManufacturer.CANON);
        newCamera.takePhotograph(2.2);
        newCamera.getName();
    }
}
