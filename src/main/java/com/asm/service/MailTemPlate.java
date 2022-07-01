package com.asm.service;

public class MailTemPlate {
 public static String DEFAULT_TEMPLATE = 
			"<!DOCTYPE html>\r\n" + 
			"\r\n" + 
			"<html lang=\"en\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" xmlns:v=\"urn:schemas-microsoft-com:vml\">\r\n" + 
			"<head>\r\n" +
			"<title></title>\r\n" + 
			"<meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\"/>\r\n" + 
			"<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\"/>\r\n" + 
			"<!--[if mso]><xml><o:OfficeDocumentSettings><o:PixelsPerInch>96</o:PixelsPerInch><o:AllowPNG/></o:OfficeDocumentSettings></xml><![endif]-->\r\n" + 
			"<!--[if !mso]><!-->\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Bitter\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Cabin\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Permanent+Marker\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Roboto+Slab\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Merriweather\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Droid+Serif\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<!--<![endif]-->\r\n" + 
			"<style>\r\n" + 
			"		* {\r\n" + 
			"			box-sizing: border-box;\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		body {\r\n" + 
			"			margin: 0;\r\n" + 
			"			padding: 0;\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		a[x-apple-data-detectors] {\r\n" + 
			"			color: inherit !important;\r\n" + 
			"			text-decoration: inherit !important;\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		#MessageViewBody a {\r\n" + 
			"			color: inherit;\r\n" + 
			"			text-decoration: none;\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		p {\r\n" + 
			"			line-height: inherit\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		.desktop_hide,\r\n" + 
			"		.desktop_hide table {\r\n" + 
			"			mso-hide: all;\r\n" + 
			"			display: none;\r\n" + 
			"			max-height: 0px;\r\n" + 
			"			overflow: hidden;\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		.menu_block.desktop_hide .menu-links span {\r\n" + 
			"			mso-hide: all;\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		@media (max-width:660px) {\r\n" + 
			"			.desktop_hide table.icons-inner {\r\n" + 
			"				display: inline-block !important;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.icons-inner {\r\n" + 
			"				text-align: center;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.icons-inner td {\r\n" + 
			"				margin: 0 auto;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.row-content {\r\n" + 
			"				width: 100% !important;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.column .border,\r\n" + 
			"			.mobile_hide {\r\n" + 
			"				display: none;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			table {\r\n" + 
			"				table-layout: fixed !important;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.stack .column {\r\n" + 
			"				width: 100%;\r\n" + 
			"				display: block;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.mobile_hide {\r\n" + 
			"				min-height: 0;\r\n" + 
			"				max-height: 0;\r\n" + 
			"				max-width: 0;\r\n" + 
			"				overflow: hidden;\r\n" + 
			"				font-size: 0px;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.desktop_hide,\r\n" + 
			"			.desktop_hide table {\r\n" + 
			"				display: table !important;\r\n" + 
			"				max-height: none !important;\r\n" + 
			"			}\r\n" + 
			"		}\r\n" + 
			"	</style>\r\n" + 
			"</head>\r\n" + 
			"<body style=\"background-color: #fffaf2; margin: 0; padding: 0; -webkit-text-size-adjust: none; text-size-adjust: none;\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"nl-container\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #fffaf2; background-image: none; background-position: top left; background-size: auto; background-repeat: no-repeat;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-1\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #ffffff; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 20px; padding-bottom: 30px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"image_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"width:100%;padding-right:0px;padding-left:0px;\">\r\n" + 
			"<div align=\"center\" style=\"line-height:10px\"><a href=\"www.example.com\" style=\"outline:none\" tabindex=\"-1\" target=\"_blank\"><img alt=\"K&M SHOP\" src=\"images/Screenshot_2022-06-15_011159.png\" style=\"display: block; height: auto; border: 0; width: 126px; max-width: 100%;\" title=\"K&M SHOP\" width=\"126\"/></a></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-2\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #f9ecdc; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 15px; padding-bottom: 5px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"15\" cellspacing=\"0\" class=\"image_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<div align=\"center\" style=\"line-height:10px\"><a href=\"www.example.com\" style=\"outline:none\" tabindex=\"-1\" target=\"_blank\"><img alt=\"stars icon\" src=\"images/stars.png\" style=\"display: block; height: auto; border: 0; width: 160px; max-width: 100%;\" title=\"stars icon\" width=\"160\"/></a></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-3\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #f9ecdc; color: #000000; background-position: center top; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 15px; padding-bottom: 0px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"text_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-top:15px;\">\r\n" + 
			"<div style=\"font-family: sans-serif\">\r\n" + 
			"<div class=\"txtTinyMce-wrapper\" style=\"font-family: Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif; font-size: 12px; mso-line-height-alt: 18px; color: #2b2d49; line-height: 1.5;\">\r\n" + 
			"<p style=\"margin: 0; font-size: 14px; text-align: center; mso-line-height-alt: 45px; letter-spacing: 2px;\"><span style=\"font-size:30px;caret-color:#152a6d;\"><strong>THANK YOU FOR BUYING</strong></span></p>\r\n" + 
			"<p style=\"margin: 0; font-size: 14px; text-align: center; mso-line-height-alt: 33px; letter-spacing: 2px;\"><span style=\"font-size:22px;\"><em><span style=\"caret-color:#152a6d;\">FOR YOUR ATTRIBUTE</span></em></span></p>\r\n" + 
			"</div>\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"image_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"width:100%;padding-right:0px;padding-left:0px;\">\r\n" + 
			"<div align=\"center\" style=\"line-height:10px\"><a href=\"www.example.com\" style=\"outline:none\" tabindex=\"-1\" target=\"_blank\"><img alt=\"Independence Day Banner Image\" src=\"images/1009.jpg\" style=\"display: block; height: auto; border: 0; width: 576px; max-width: 100%;\" title=\"Independence Day Banner Image\" width=\"576\"/></a></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-4\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #f9ecdc; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 10px; padding-bottom: 5px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"text_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<div style=\"font-family: sans-serif\">\r\n" + 
			"<div class=\"txtTinyMce-wrapper\" style=\"font-family: Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif; font-size: 12px; mso-line-height-alt: 18px; color: #2b2d49; line-height: 1.5;\">\r\n" + 
			"<p style=\"margin: 0; font-size: 14px; text-align: center; mso-line-height-alt: 45px;\"><span style=\"font-size:30px;caret-color:#152a6d;\"><strong>FREE SHIPPING +</strong></span></p>\r\n" + 
			"<p style=\"margin: 0; font-size: 14px; text-align: center;\"><span style=\"color:#152a6d;\"><span style=\"caret-color:#152a6d;font-size:30px;\"><span style=\"color:#a31731;\"><strong><span style=\"color:#a31731;\">30%</span> OFF</strong></span></span></span></p>\r\n" + 
			"</div>\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"text_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-left:30px;padding-right:30px;padding-top:20px;\">\r\n" + 
			"<div style=\"font-family: sans-serif\">\r\n" + 
			"<div class=\"txtTinyMce-wrapper\" style=\"font-size: 12px; font-family: Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif; mso-line-height-alt: 14.399999999999999px; color: #2b2d49; line-height: 1.2;\">\r\n" + 
			"<p style=\"margin: 0; font-size: 14px; text-align: center;\"><span style=\"font-size:16px;color:#2b2d49;\">IF YOU HAVE ANY QUESTION OF US, JUST CONTACT</span></p>\r\n" + 
			"</div>\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"text_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-top:40px;padding-bottom:20px;\">\r\n" + 
			"<div style=\"font-family: sans-serif\">\r\n" + 
			"<div class=\"txtTinyMce-wrapper\" style=\"font-family: Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif; font-size: 12px; mso-line-height-alt: 14.399999999999999px; color: #2b2d49; line-height: 1.2;\">\r\n" + 
			"<p style=\"margin: 0; font-size: 14px; text-align: center;\"><span style=\"font-size:30px;caret-color:#152a6d;\"><strong>STARTED DELIVERY</strong></span></p>\r\n" + 
			"</div>\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-5\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #f9ecdc; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"33.333333333333336%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"empty_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-right:0px;padding-bottom:5px;padding-left:0px;padding-top:5px;\">\r\n" + 
			"<div></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"<td class=\"column column-2\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"33.333333333333336%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"empty_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-right:0px;padding-bottom:5px;padding-left:0px;padding-top:5px;\">\r\n" + 
			"<div></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"<td class=\"column column-3\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"33.333333333333336%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"empty_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-right:0px;padding-bottom:5px;padding-left:0px;padding-top:5px;\">\r\n" + 
			"<div></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-6\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #f9ecdc; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 0px; padding-bottom: 0px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"button_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"text-align:center;padding-top:35px;padding-bottom:50px;\">\r\n" + 
			"<div align=\"center\">\r\n" + 
			"<!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"https://www.example.com\" style=\"height:44px;width:208px;v-text-anchor:middle;\" arcsize=\"21%\" strokeweight=\"0.75pt\" strokecolor=\"#2B2D49\" fillcolor=\"#2b2d49\"><w:anchorlock/><v:textbox inset=\"0px,0px,0px,0px\"><center style=\"color:#ffffff; font-family:Tahoma, sans-serif; font-size:16px\"><![endif]--><a href=\"https://www.example.com\" style=\"text-decoration:none;display:inline-block;color:#ffffff;background-color:#2b2d49;border-radius:9px;width:auto;border-top:1px solid #2B2D49;font-weight:400;border-right:1px solid #2B2D49;border-bottom:1px solid #2B2D49;border-left:1px solid #2B2D49;padding-top:5px;padding-bottom:5px;font-family:Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif;text-align:center;mso-border-alt:none;word-break:keep-all;\" target=\"_blank\"><span style=\"padding-left:20px;padding-right:20px;font-size:16px;display:inline-block;letter-spacing:2px;\"><span style=\"font-size: 16px; line-height: 2; word-break: break-word; mso-line-height-alt: 32px;\">TAKE YOUR PICK</span></span></a>\r\n" + 
			"<!--[if mso]></center></v:textbox></v:roundrect><![endif]-->\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-7\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #ffffff; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 0px; padding-bottom: 0px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"image_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"width:100%;padding-right:0px;padding-left:0px;padding-top:40px;padding-bottom:20px;\">\r\n" + 
			"<div align=\"center\" style=\"line-height:10px\"><a href=\"www.example.com\" style=\"outline:none\" tabindex=\"-1\" target=\"_blank\"><img alt=\"your-logo\" src=\"images/logo_14.png\" style=\"display: block; height: auto; border: 0; width: 144px; max-width: 100%;\" title=\"your-logo\" width=\"144\"/></a></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-8\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #ffffff; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 0px; padding-bottom: 10px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"social_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-left:20px;padding-right:20px;text-align:center;\">\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"social-table\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"168px\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding:0 5px 0 5px;\"><a href=\"https://www.example.com\" target=\"_blank\"><img alt=\"Facebook\" height=\"32\" src=\"images/facebook2x.png\" style=\"display: block; height: auto; border: 0;\" title=\"Facebook\" width=\"32\"/></a></td>\r\n" + 
			"<td style=\"padding:0 5px 0 5px;\"><a href=\"https://www.example.com\" target=\"_blank\"><img alt=\"Twitter\" height=\"32\" src=\"images/twitter2x.png\" style=\"display: block; height: auto; border: 0;\" title=\"Twitter\" width=\"32\"/></a></td>\r\n" + 
			"<td style=\"padding:0 5px 0 5px;\"><a href=\"https://www.example.com\" target=\"_blank\"><img alt=\"Instagram\" height=\"32\" src=\"images/instagram2x.png\" style=\"display: block; height: auto; border: 0;\" title=\"Instagram\" width=\"32\"/></a></td>\r\n" + 
			"<td style=\"padding:0 5px 0 5px;\"><a href=\"https://www.example.com\" target=\"_blank\"><img alt=\"LinkedIn\" height=\"32\" src=\"images/linkedin2x.png\" style=\"display: block; height: auto; border: 0;\" title=\"LinkedIn\" width=\"32\"/></a></td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-9\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #ffffff; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 0px; padding-bottom: 0px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"10\" cellspacing=\"0\" class=\"text_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<div style=\"font-family: sans-serif\">\r\n" + 
			"<div class=\"txtTinyMce-wrapper\" style=\"font-size: 14px; font-family: Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif; mso-line-height-alt: 16.8px; color: #4a4a4a; line-height: 1.2;\">\r\n" + 
			"<p style=\"margin: 0; text-align: center;\">Your Street 12, 34567 AB City</p>\r\n" + 
			"<p style=\"margin: 0; text-align: center;\">info@example.com</p>\r\n" + 
			"<p style=\"margin: 0; text-align: center;\">(+1) 123 456 789</p>\r\n" + 
			"</div>\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-10\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #ffffff; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 5px; padding-bottom: 5px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"menu_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"color:#4a4a4a;font-family:inherit;font-size:14px;text-align:center;padding-bottom:40px;\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"text-align:center;font-size:0px;\">\r\n" + 
			"<div class=\"menu-links\">\r\n" + 
			"<!--[if mso]>\r\n" + 
			"<table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\" style=\"\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-top:5px;padding-right:5px;padding-bottom:5px;padding-left:5px\">\r\n" + 
			"<![endif]--><a href=\"www.example.com\" style=\"padding-top:5px;padding-bottom:5px;padding-left:5px;padding-right:5px;display:inline-block;color:#4a4a4a;font-family:Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif;font-size:14px;text-decoration:none;letter-spacing:normal;\">Unsubscribe</a>\r\n" + 
			"<!--[if mso]></td><td><![endif]--><span class=\"sep\" style=\"font-size:14px;font-family:Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif;color:#4a4a4a;\">| </span>\r\n" + 
			"<!--[if mso]></td><![endif]-->\r\n" + 
			"<!--[if mso]></td><td style=\"padding-top:5px;padding-right:5px;padding-bottom:5px;padding-left:5px\"><![endif]--><a href=\"www.example.com\" style=\"padding-top:5px;padding-bottom:5px;padding-left:5px;padding-right:5px;display:inline-block;color:#4a4a4a;font-family:Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif;font-size:14px;text-decoration:none;letter-spacing:normal;\">Manage Preferences</a>\r\n" + 
			"<!--[if mso]></td></tr></table><![endif]-->\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-11\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 5px; padding-bottom: 5px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"icons_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"vertical-align: middle; color: #9d9d9d; font-family: inherit; font-size: 15px; padding-bottom: 5px; padding-top: 5px; text-align: center;\">\r\n" + 
			"<table cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"vertical-align: middle; text-align: center;\">\r\n" + 
			"<!--[if vml]><table align=\"left\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"display:inline-block;padding-left:0px;padding-right:0px;mso-table-lspace: 0pt;mso-table-rspace: 0pt;\"><![endif]-->\r\n" + 
			"<!--[if !vml]><!-->\r\n" + 
			"<table cellpadding=\"0\" cellspacing=\"0\" class=\"icons-inner\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; display: inline-block; margin-right: -4px; padding-left: 0px; padding-right: 0px;\">\r\n" + 
			"<!--<![endif]-->\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"vertical-align: middle; text-align: center; padding-top: 5px; padding-bottom: 5px; padding-left: 5px; padding-right: 6px;\"><a href=\"https://www.designedwithbee.com/\" style=\"text-decoration: none;\" target=\"_blank\"><img align=\"center\" alt=\"Designed with BEE\" class=\"icon\" height=\"32\" src=\"images/bee.png\" style=\"display: block; height: auto; margin: 0 auto; border: 0;\" width=\"34\"/></a></td>\r\n" + 
			"<td style=\"font-family: Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif; font-size: 15px; color: #9d9d9d; vertical-align: middle; letter-spacing: undefined; text-align: center;\"><a href=\"https://www.designedwithbee.com/\" style=\"color: #9d9d9d; text-decoration: none;\" target=\"_blank\">Designed with BEE</a></td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table><!-- End -->\r\n" + 
			"</body>\r\n" + 
			"</html>";
}
