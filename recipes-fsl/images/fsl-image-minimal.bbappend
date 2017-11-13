inherit disable-services
ROOTFS_POSTPROCESS_COMMAND_append_ls1012a = "rootfs_disable_unnecessary_services;"

IMAGE_INSTALL_append = " wget openssh util-linux util-linux-blkid e2fsprogs dosfstools net-tools busybox-udhcpc sudo file bash"

