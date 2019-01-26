public class box_constructor extends main_file
{
    int height;
    int length;
    int width;

        box_constructor(int width, int height, int length)
        {
            this.width  = width;
            this.height = height;
            this.length = length;
        }

        int volume()
        {
            int volume;

                volume = height * length * width;

            return volume;
        }
}
