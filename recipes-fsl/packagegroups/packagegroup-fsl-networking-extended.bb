# Copyright (C) 2015 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Freescale Package group for extended networking tools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

PACKAGES = "${PN}"

FSL_WEBSERVER ?= ""
RDEPENDS_${PN} = " \
    bind \
    curl \
    dhcp-client \
    libnfnetlink \
    linuxptp \
    ntpdate \
    ppp \
    ppp-dialin \
    ptpd \
    resolvconf \
    rp-pppoe \
    samba \
    wget \
    xinetd \
    ${FSL_WEBSERVER} \
"
